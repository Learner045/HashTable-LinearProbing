package LinearProbing;

public class HashTable {

   private HashItem[] hashTable=new HashItem[10];

   private int hashFunction(int key){
       return key%10;  //assuming table size if 10
   }

   public void put(int key,int value){
       int index=hashFunction(key);

       while(hashTable[index]!=null){
           index=(index+1)%10;
       }
       hashTable[index]=new HashItem(key,value);

   }

   public int get(int key){
       int index=hashFunction(key);

       while(hashTable[index]!=null && hashTable[index].getKey()!=key){
           index=(index+1)%10;
       }
       if(hashTable[index]==null){
           //coudn't find key
           return -1;
       }else{
           return hashTable[index].getValue();
       }
   }
}
