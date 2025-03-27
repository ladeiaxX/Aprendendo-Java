import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String ladeinha = "String Maneira";
        Integer cadeinhaDoLadeia = 1756;
        Double numeroDecimal = 17.5;
        char stringChar = 'o';
        Boolean ladeiaÉTop = true;
        
        
        System.out.println(cadeinhaDoLadeia + numeroDecimal);
        System.out.println(Math.pow(cadeinhaDoLadeia, numeroDecimal));
        
        List<Integer> listinhaDoLadeia = new ArrayList<>();
        listinhaDoLadeia.add(1945);
        listinhaDoLadeia.add(557);
        listinhaDoLadeia.add(1663);
        
        // List<Integer> outraLista = List.of(1945, 12, 1663); outra forma de criar lista.
        
        System.out.println(listinhaDoLadeia);
        
        Map<String, Integer> hashLadeia = new HashMap<>();
        hashLadeia.put("id", 12);
        hashLadeia.put("id2", 24);
        
        System.out.println(hashLadeia);
        
        if(numeroDecimal>=30.5){
            // !ladeiaÉTop = ladeiaÉTop==false
            System.out.println("true");
            
        } else{
            System.out.println("false");
            
        }
        
        
    }
}