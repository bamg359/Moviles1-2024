package helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaCliente {


    private static final String ID_REGEX = "^\\d+$";
    private static final String NAME_REGEX = "^[a-zA-Z\\s]+$";


    private static final Pattern idPattern = Pattern.compile(ID_REGEX);
    private static final Pattern namePattern= Pattern.compile(NAME_REGEX);


    public static boolean validarId(String id){
             //String idStr = id +"";
             //Matcher matcher = idPattern.matcher(idStr);
             return id.matches(ID_REGEX);
    }

    public static boolean validarNombre(String name){
        return name.matches(NAME_REGEX);
    }



}
