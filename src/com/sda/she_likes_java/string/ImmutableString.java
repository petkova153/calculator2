package com.sda.she_likes_java.string;

public class ImmutableString {
    public static void main(String[] args) {
        String name = "SomeNAme";
        String name2;
        name2 = name.concat(" Same");
        System.out.printf("Name was :" + name);
        System.out.println("\nName is now: " + name2);

        StringBuilder friendsname = new StringBuilder("Friend1");
        friendsname.append(" GoodFriend");
        System.out.printf("\n\nWhen you concatinate in Stringbuilder you can actually modify" +
                "the string just as: " + friendsname);
    }
}
