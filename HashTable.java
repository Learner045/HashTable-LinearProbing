package LinearProbing;

public class HashTable {

   private HashItem[] hashTable=new HashItem[10];

   private int hashFunction(int key){
       return key%10;  //assuming table size if 10
   }

   public void put(int key,int value){
       int index=hashFunction(key);

       //if hashtable at index is not null that means it has data and
       //we also check if this data's key is not equal to the key we are trying to newly put
       //it will break prematurely if it finds a key
       //then we only need to update the key
       //if it becomes null when it finds an empty spot then we add new data at that index
       while(hashTable[index]!=null && hashTable[index].getKey()!=key){
           index=(index+1)%10;
       }
       if(hashTable[index]!=null && hashTable[index].getKey()==key){
           //key already present so update values
           hashTable[index].setValue(value);return;
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
