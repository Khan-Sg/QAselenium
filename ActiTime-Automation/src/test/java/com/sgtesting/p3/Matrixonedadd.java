package com.sgtesting.p3;

public class Matrixonedadd {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={1,1,1,1,1,1};
        int c[]=new int[a.length];
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                c[i]=a[i]+b[i];
                System.out.print(c[i]+" ");
            }
        }else{
            System.out.println("matrix index not matched");
        }
    }
}
