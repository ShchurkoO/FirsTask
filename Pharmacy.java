import java.util.*;


public class Pharmacy{
        
 private String nameSellerPharmacy; //no used))
 private List<String> phName;
        
          Pharmacy(String nameSellerPharmacy,List<String> phName){
              
             this.nameSellerPharmacy = nameSellerPharmacy;
             this.phName = phName;
           }
          
         public List<String> getphName(){// getter for name of product
              return phName;
          }
    
    public static void main(String args[]) {
        
     List<String> medicinesOnline = List.of("Askorbinka", "Nazonex", "Dekatylen", "Strepsils", "Zelenka");
    
     
    List<Pharmacy> pharmacies = List.of(new Pharmacy("3i", List.of("Nazonex", "Vitamin C", "Zn Supplements")),
                                    new Pharmacy("DS", List.of("Vitamin C", "Advil", "Doppel Herz")),
                                    new Pharmacy("Kopiiochka", List.of("Ibuprofen", "Vitamin C")));
                                    

  Set<String> newSet = new HashSet<String>(medicinesOnline);   //easy delete dublicate
  
    for(int i = 0; i < pharmacies.size(); i++)
        newSet.addAll(pharmacies.get(i).getphName());  //duplicate delete
   
     
       List<String> newList = new ArrayList<String>(newSet);
       
       Collections.sort(newList); // sort
       
       System.out.println(newList);
    }
}