import java.util.LinkedList;
import java.util.Queue;

class Solution{
        public int solution(int bridge_length, int weight, int[] truck_weights) {

            Queue<Integer> bridge = new LinkedList<>();
            Queue<Integer> truck = new LinkedList<>();

            for (int truckWeight : truck_weights) {
                truck.offer(truckWeight);
            }

            for (int i = 0; i < bridge_length; i++) {
                bridge.offer(0);
            }

            int second = 0;
            int currentWeight = 0;
            while (!truck.isEmpty() || currentWeight > 0) {
                second++;
                currentWeight -= bridge.poll();
                int currentTruck = 0;

                if(!truck.isEmpty()){
                    currentTruck = truck.peek();
                }

                if(bridge.size() < bridge_length) {
                    if(currentWeight + currentTruck <= weight) {
                        bridge.offer(truck.poll());
                        currentWeight += currentTruck;
                    } else{
                        bridge.offer(0);
                    }
                }
            }

            return second;
        }
    }