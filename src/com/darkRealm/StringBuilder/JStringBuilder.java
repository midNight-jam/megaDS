package com.darkRealm.StringBuilder;

/**
 * Created by Jayam on 10/2/2016.
 */
public class JStringBuilder implements IStringBuilder {
    private char [] content;
    private int size;

    public JStringBuilder(){
        content= new char[]{};
        size = 0;
    }


    @Override
    public void append(String src) {
        if(size==0){
            content = new char[size + src.length()];
            System.arraycopy(src, 0, content, 0, src.length());
            return;
        }

        char[] temp = new char[size + src.length()];
        // first create a temp array of bigger size then call arraycpoy to copy the contents of older array to new array
        System.arraycopy(content, 0, temp, 0, size);
        content = temp;


        for(int i = 0;i<src.length();i++){
            content[i+size+1] = src.charAt(i);
        }
        size += src.length();
    }

    @Override
    public String toString(){
        return content.toString();
    }
}
