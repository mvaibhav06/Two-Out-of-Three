class TwoOutOfThree {
    public List<Integer> twoOutOfThree(int[] num1, int[] num2, int[] num3) {
        List<Integer> out = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();

        for(int i=0; i<num1.length; i++){
            temp.add(num1[i]);
        }
        for(int i=0; i<num2.length; i++){
            if(temp.contains(num2[i]) && !out.contains(num2[i])){
                out.add(num2[i]);
            }
            temp1.add(num2[i]);
        }
        for(int i=0; i<num3.length; i++){
            if(temp.contains(num3[i]) && !out.contains(num3[i])){
                out.add(num3[i]);
            }
            if(temp1.contains(num3[i]) && !out.contains(num3[i])){
                out.add(num3[i]);
            }
            
        }
        return out;
    }
}
