class Solution {
    public static List<String> letterCombinations(String digits) {

        if(digits.length()==0) {
            List<String> res=new ArrayList<>();
            return res;
        }

        String[] arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        String[] req=new String[digits.length()];

        for(int i=0;i<digits.length();i++){
            req[i]=arr[Integer.parseInt(String.valueOf(digits.charAt(i)))-1];
        }

        System.out.println(Arrays.toString(req));


        if(req.length==1){
            return one(req[0]);
        }

        else if(req.length==2){
            return two(req[0],req[1]);
        }

        else if(req.length==3){
            return three(req[0],req[1],req[2]);
        }

        else if(req.length==4){
            return four(req[0],req[1],req[2],req[3]);
        }

        else if(req.length==5){
            return five(req[0],req[1],req[2],req[3],req[4]);
        }

        return new ArrayList<>();
    }

    private static List<String> one(String arr){
         List<String> list=new ArrayList<>();

         for(int i=0;i< arr.length();i++){
             String s=String.valueOf(arr.charAt(i));
             list.add(s);
         }
         return list;
    }
    private static List<String> two(String s1,String s2){
        List<String> list=new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                String s=String.valueOf(s1.charAt(i))+String.valueOf(s2.charAt(j));
                list.add(s);
            }
        }
        return list;
    }

    private static List<String> three(String s1,String s2,String s3){
        List<String> list=new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                for(int k=0;k<s3.length();k++){
                    String s=String.valueOf(s1.charAt(i))+String.valueOf(s2.charAt(j))+String.valueOf(s3.charAt(k));
                    list.add(s);
                }
            }
        }
        return list;
    }

    private static List<String> four(String s1,String s2,String s3,String s4){
        List<String> list=new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                for(int k=0;k<s3.length();k++){
                    for(int l=0;l<s4.length();l++){
                        String s=String.valueOf(s1.charAt(i))+String.valueOf(s2.charAt(j))+
                                 String.valueOf(s3.charAt(k))+String.valueOf(s4.charAt(l));
                        list.add(s);
                    }
                }
            }
        }
        return list;
    }

    private static List<String> five(String s1,String s2,String s3,String s4,String s5){
        List<String> list=new ArrayList<>();

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                for(int k=0;k<s3.length();k++){
                    for(int l=0;l<s4.length();l++){
                        for(int m=0;m<s5.length();m++){
                            String s=String.valueOf(s1.charAt(i))+String.valueOf(s2.charAt(j))+
                                     String.valueOf(s3.charAt(k))+String.valueOf(s4.charAt(l))+
                                     String.valueOf(s5.charAt(l)) ;
                            list.add(s);
                        }
                    }
                }
            }
        }
        return list;
    }
}