public class Main {
    public static void main(String[] args) {

       // Boolean algebra operations
          //2 <= 2 && !true
          /* 2 non è maggiore di 2 ma è uguale
          e !true equivale a false usando l'operatore logico end &&
          andremo a verificare se tutti e due saranno true se risulteranno true
          allora sarà true se uno di loro risulterà false allora sarà false
          result : false*/
          int num1 = 2;
          int num2 = 2;
          boolean bool = !true;
          boolean result = num1 <= num2 && !true;

          System.out.println(result);


        //!false && 3 > 2
        /* !false equivale a true e 3 è maggiore di 2 quindi tutti e due risulteranno true
        quindi il risultato finale sarà true*/
        boolean bool2 = !false;
        int num3 = 3;
        int num4 = 2;

        boolean result2 = !false && num3 > num4;

        System.out.println(result2);


        /* !t questo nega il valore di t, che è false. Quindi !t diventerà true.
        !(!t || f)  qui, abbiamo un || operatore OR ( ) tra !t ed f. Poiché !t è true, !t || f restituisce true perché almeno uno degli operandi è true.
        Infine, neghiamo il valore dell'utilizzo !(!t || f)dell'operatore !. Dal momento !(!t || f)che è true, negandolo ci darà false.
        quindi il risultato sarà false*/
        boolean t = false;
        boolean f = true;
        boolean result3 = !(!t || f);

        System.out.println(result3);


        /*six > six2 questo confronto controlla se 6 è maggiore di 6. six e six2 hanno lo stesso valore, quindi questo confronto restituisce false.
        true && true è un'operazione AND logica tra true e true, che restituisce true.
        !(true && true) l' operatore not ! nega il valore di true && true, ovvero true, quindi !(true && true) restituisce false
        poiché il confronto six > six2 è false ed !(true && true) è false, l'operazione XOR ^ restituisce false.*/
        int six = 6;
        int six2 = 6;
        boolean result4 = six > six2 ^ !(true && true);

        System.out.println(result4);
