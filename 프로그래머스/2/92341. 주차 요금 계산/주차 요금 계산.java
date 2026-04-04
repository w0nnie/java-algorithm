import java.util.*;

class Solution {

        public int[] solution(int[] fees, String[] records) {

            Map<String, List<String>> recodeMap = new HashMap<>();

            for (String record : records) {
                String[] split = record.split(" ");

                String carNumber = split[1];

                recodeMap.putIfAbsent(carNumber, new ArrayList<>());
                recodeMap.get(carNumber).add(split[0]);
            }

            Map<String, Integer> parkingHours = new HashMap<>();

            for (String carNum : recodeMap.keySet()) {
                List<String> timeRecords = recodeMap.get(carNum);
                // phase1: 시간계산
                int time = timeCalculate(timeRecords);

                parkingHours.put(carNum, time);
            }

            //phase2: 요금계산
            return payCalculate(parkingHours, fees);
        }

        int[] payCalculate(Map<String, Integer> parkingHours, int[] fees) {

            double defaultTime = fees[0];
            double defaultFee = fees[1];
            double unitTime = fees[2];
            double unitFee = fees[3];

            List<String> carNums = new ArrayList<>(parkingHours.keySet());
            Collections.sort(carNums);

            int[] answer = new int[parkingHours.size()];
            int index = 0;
            for (String carNum : carNums) {
                int parkingMinutes = parkingHours.get(carNum);
                int price = 0;

                if(parkingMinutes <= defaultTime){
                    price = (int) defaultFee;
                } else {
                    price = (int) (defaultFee + (int) Math.ceil(((parkingMinutes - defaultTime) / unitTime)) * unitFee);
                }

                answer[index++] = price;
            }

            return answer;
        }


        int timeCalculate(List<String> timeRecords) {

            // 입차된 차량이 출차 내역이 없는경우 23:59 출차된것으로 간주
            if(!(timeRecords.size()%2==0)) timeRecords.add("23:59");

            int time = 0;
            for (int i = 0; i < timeRecords.size(); i+=2) {
                String[] startTime = timeRecords.get(i).split(":");
                int startHour = Integer.parseInt(startTime[0]);
                int startMinute = Integer.parseInt(startTime[1]);

                String[] endTime = timeRecords.get(i+1).split(":");
                int endHour = Integer.parseInt(endTime[0]);
                int endMinute = Integer.parseInt(endTime[1]);

                time += (endHour * 60 + endMinute) - (startHour * 60 + startMinute);
            }

            return time;
        }
    }