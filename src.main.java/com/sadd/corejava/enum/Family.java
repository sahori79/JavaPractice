package com.premierinc.dashboard.constants;

public enum Family

{

                FATHER("Ashraf"),
                MOTHER("REBA"),
                BROTHER1("MASUD"),
                BROTHER2("MARUF"),
                BROTHER3("MURAD"),
                BROTHER4("SAMAD"),
                SISTER("RIMA"),
                ME("RIAD")    ;

    private String nickName;

    Family(String nickName){
        this.nickName=nickName;
    }

    public String getNickName(){
        return this.nickName;
    }

    public static void main(String[] args){

    System.out.println("Eldest brother is "+Family.BROTHER1.getNickName());

        //or
    for(Family familyMember: Family.values()){

        System.out.println("one members in Ashraf family is : " + familyMember + " and nick name is " + familyMember.getNickName());

    }

}

}