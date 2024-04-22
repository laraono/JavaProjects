/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.*;

/**
 *
 * @author isaon
 */
public class Collections {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* ======== MAP ========= */
        Map<Integer, String> mapa = new TreeMap<>();
        mapa.put(1, "Lara");
        mapa.put(2, "Zuiz");
        mapa.put(3, "Ozzy");
        mapa.put(4, "Bolsonaro");
        
        System.out.printf("%s\n",mapa);
        
        System.out.printf("%s\n",mapa.get(4));
        
        System.out.printf("%d\n",mapa.size());
        mapa.replace(4, "Lula");
        
        mapa.remove(4);
         System.out.printf("%d\n",mapa.size());
         /* IMPRIMIR */
         for(Map.Entry<Integer,String> entry : mapa.entrySet()){
             System.out.printf("%d - %s\n", entry.getKey(), entry.getValue());
         }
        /* COPIAR */
         Map<Integer, String> mapa2 = new TreeMap<>();
         mapa2.putAll(mapa);
        
           for(Map.Entry<Integer,String> entry : mapa2.entrySet()){
             System.out.printf("%d - %s\n", entry.getKey(), entry.getValue());
         }
           if(mapa2.containsValue("Ozz")){
                 System.out.print("Achei!");
            
           }
          System.out.printf("%s",mapa2.keySet());
          
           Map<Integer,String> hash_map= new HashMap<>();  
        /* ====== QUEUE ====== */
        PriorityQueue<String> cor = new PriorityQueue<>();
        cor.offer("Azul");
        cor.offer("Amarelo");
        cor.offer("Rosa");
        System.out.printf("%s\n",cor);
        for(String str : cor){
        System.out.printf("Cor:%s\n",str);
        }
        System.out.printf("%s\n",cor.peek());
        System.out.printf("%s\n",cor.poll());
        System.out.printf("%s\n",cor.peek());
        System.out.printf("%d\n",cor.size());
        PriorityQueue<String> cor2 = new PriorityQueue<>();
        cor2.addAll(cor);
        for(String str : cor){
        System.out.printf("Cor2:%s\n",str);
        }
        Object[] array = cor2.toArray();
        System.out.printf("%d",array.length);
        
            /* === SET === */
        HashSet<String> set = new HashSet<String>();
        set.add("Oi");
         set.add("Oi");
          set.add("Oi"); set.add("Oi");
          
        set.add("AAAaaa");
        set.add("ZBBaaa");
        System.out.printf("%s\n%d\n",set,set.size());
        for(Object str : set){
        System.out.printf("%s\n",str);
        }
        HashSet<String> set2 = new HashSet<String>();
           TreeSet set3 = new TreeSet<String>(set);
        set2 = (HashSet) set.clone();
         set2.add("ZBBaaaaaaa");
          set2.add("ZzzzzzBBaaa");
         set2.retainAll(set); // Mantém apenas a interseção
         for(Object str : set2){
             if(set.contains(str)){
                         System.out.printf("Sim\n");
             }else {
             System.out.printf("Não\n");
             }
        }
         
         
           for(Object str : set3){
        System.out.printf("%s\n",str);
        }
         Object[] array2 = cor2.toArray();

         System.out.printf("%d",array2.length);   
    
 
                
                }
    

    

}
