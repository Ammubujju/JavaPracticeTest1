package com.stackroute.pe1;

public class CharacterDisplay {

    public String display(char character) {


        if(character >= 97 && character <= 123) //comparing ascii values of small letters
        {
            return "Small Letter";
        }
        else if(character >= 65 && character <= 96)//comparing ascii values of capital letters
        {
            return "Capital Letter";
        }
        else if(character >= 48 && character <= 57) //comparing ascii values of digits
        {
            return "Digit";
        }
        else
        {
            return "Special character";
        }

    }

}
