package streams;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAmigo {
    public static void main(String[] args) {


        PersoneAmigo p1 =new PersoneAmigo("mustapha",34);
        PersoneAmigo p2 =new PersoneAmigo("driss",31);
        PersoneAmigo p3 =new PersoneAmigo("abdelilah",39);
        List<PersoneAmigo> personeAmigos = List.of(p1,p2,p3);
        List<PersoneAmigo> result=personeAmigos.stream()

                .filter(p -> p.getAge() >31)
                .toList();

        //result.forEach(System.out::println);

        List<Integer> inti=new ArrayList<>();
        inti.add(1);
        inti.add(2);
        inti.add(3);
        inti= inti.stream().map(integer -> integer*2).toList();
        //inti.forEach(System.out::println);

        Map<String ,Integer> pmap=new HashMap<>();
         pmap=personeAmigos.stream().filter(p->p.getAge()>31)
                .collect(Collectors.toMap(p -> p.getName(),p -> p.getAge()));

        List<PersoneAmigo> pa= Arrays.asList(p1);
        List<PersoneAmigo> pa2=Arrays.asList(p2,p3);
        List<List<PersoneAmigo>> reslist = Arrays.asList(pa,pa2);

        System.out.println( reslist.stream().flatMap(plist ->plist.stream()).
                 max((val1,val2)->{return val1.compareTo(val2);}));


        //convert int int list to string , concat arrays and reduce them using streams
       /*
       List<Integer> intl=Arrays.asList(1,2,3,4);
        List<String > strl=Arrays.asList("a","b","c","d");
        List<String > resInttoStr=new ArrayList<>();
        resInttoStr= intl.stream().map(s->s.toString()).collect(Collectors.toList());
        List<String > concatStr=Stream.concat(strl.stream(),resInttoStr.stream()).toList();

        System.out.println(concatStr);

        List<String>reducedLi=concatStr.stream().reduce((val,combainedva)->val+combainedva).stream().toList();
        System.out.println(reducedLi);*/


        //convert string int list to int , concat arrays and reduce them using streams
        List<Integer> intl=Arrays.asList(1,2,3,4);
        List<String > intSTr=Arrays.asList("5","6","7","8");
        List<Integer> testInt=new ArrayList<>();
        testInt=intSTr.stream().map(n->Integer.parseInt(n)).toList();
      /*  for (String  s:intSTr) {

            testInt.add(Integer.parseInt(s));
        }*/

        System.out.println(testInt);
        List<Integer> concatInt=Stream.
                concat(testInt.stream(),intl.stream())
                .toList();
        List<Integer> reduceLiIn=concatInt.stream().reduce((n1,n2)->n1+n2).stream().toList();
        System.out.println(reduceLiIn);
    }


}
