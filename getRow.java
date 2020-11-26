class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<>();
        if (rowIndex==0) lst.add(1);
        else {
            lst.add(1);lst.add(1);
            while (rowIndex>1) {
                List<Integer> temp=new ArrayList<>();
                temp.add(1);
                for (int i=0;i<lst.size()-1;i++) {
                    temp.add(lst.get(i)+lst.get(i+1));
                }
                temp.add(1);
                lst=temp;
                rowIndex--;
                //System.out.println(lst);
            }
        }
        return lst;
    }
}
