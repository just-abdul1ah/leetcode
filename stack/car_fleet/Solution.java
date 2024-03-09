public int carFleet(int target, int[] position, int[] speed) {
    double[] time = new double[target];
    for (int i = 0; i < speed.length; i++)
        time[position[i]] = (double) (target - position[i]) / speed[i];
    
    int answ = 0;
    double prev = 0;
    for (int i = target - 1; i >= 0; i--) {
        if (time[i] > prev) {
            answ++;
            prev = time[i];
        }
    }
    return answ;
}