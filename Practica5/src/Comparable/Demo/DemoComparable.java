package Comparable.Demo;



public class DemoComparable {
    public static void main(String[] args) {
        Persona arr[] = {new Persona(30, "Juan"),
                new Persona(400, "Filyan"),
                new Persona(90, "Pedro")};
        SortUtil.ordenar(arr);
        for (Persona p:arr){
            System.out.println(p);
        }
    }
}
