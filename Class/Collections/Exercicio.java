/* Objetivo : Apresentar o Básico das Collesctions
    Entrada : N/A
    Saída   : CRUD
*/

package br.unip.brasilia; 
import java.util.LinkedList; 
import java.util.HashSet; 
import java.util.LinkedHashSet; 
import java.util.HashMap; 
import java.util.LinkedHashMap; 
public class Exercicio {
       
         // Criando HashSet
        public static void main(String[] args) {
            Set<String> popularCities = new HashSet<>();
        
            System.out.println("Existe alguma cidade popular ? " + popularCities.isEmpty());

            popularCities.add("London");
            popularCities.add("New York");
            popularCities.add("Paris");
            popularCities.add("Dubai");

            // Procurando o tamanho HashSet
            System.out.println("Number of cities in the HashSet " + popularCities.size());

            // Checando se contém um elemento em popularCities
            String cityName = "Paris";
            if(popularCities.contains(cityName)) {
                System.out.println(cityName + " Está em popularCities.");
            } else {
                System.out.println(cityName + " Não está em popularCities.");
            }

            // Removendo elemento 
            popularCities.remove("Dubai"); 
            System.out.println("Removido Dubai cidade:"); 
            System.out.println(popularCities); 
        }

        // Creando um LinkedList
        public static void main(String[] args) {
            
            LinkedList<String> friends = new LinkedList<>();
    
            // Adicionando elementos.
            friends.add("Rajeev");
            friends.add("John");
            friends.add("David");
            friends.add("Chris");
    
            System.out.println("Initial LinkedList : " + friends);
    
            // Adicioando elementos específicos LinkedList
            friends.add(3, "Lisa");
            System.out.println("After add(3, \"Lisa\") : " + friends);
    
            // Adicionando elemento no início LinkedList
            friends.addFirst("Steve");
            System.out.println("After addFirst(\"Steve\") : " + friends);
    
            // Adicionando elemento 
            friends.addLast("Jennifer");
            System.out.println("After addLast(\"Jennifer\") : " + friends)

            //Removendo elemento primeiro elemento
            String element = friends.removeFirst();  // Lança NoSuchElementException se LinkedList estiver vazio
            System.out.println("Removendo primeiro elemento " + element + " => " + friends)
    
            // Adicioando todos os elementos LinkedList
            List<String> familyFriends = new ArrayList<>();
            familyFriends.add("Jesse");
            familyFriends.add("Walt");
    
            friends.addAll(familyFriends);
            System.out.println("Antes de adicionar todos(familyFriends) : " + friends);
        }

        // Criando HashMap
        public static void main(String[] args) {
            Map<String, String> userCityMapping = new HashMap<>();
    
            // Observando se está vazio
            System.out.println("Está vazio? : " + userCityMapping.isEmpty());
    
            userCityMapping.put("John", "New York");
            userCityMapping.put("Rajeev", "Bengaluru");
            userCityMapping.put("Steve", "London");
    
            System.out.println("userCityMapping HashMap : " + userCityMapping);
    
            // Imprimindo o tamanho
            System.out.println("Temos essas informações" + userCityMapping.size() + " users");
    
            String userName = "Steve";
            // Observando uma chave HashMap
            if(userCityMapping.containsKey(userName)) {
                // Obtenha o valor atribuído a uma determinada chave no HashMap
                String city = userCityMapping.get(userName);
                System.out.println(userName + " lives in " + city);
            } else {
                System.out.println("Detalhes cidades " + userName);
            }
    
            // Observando um valor existente HashMap
            if(userCityMapping.containsValue("New York")) {
                System.out.println("Há um usuário no userCityMapping que mora em Nova York");
            } else {
                System.out.println("Não há nenhum usuário no userCityMapping que more em Nova York");
            }
    
    
            //Modifica o valor atribuído a uma chave existente
            userCityMapping.put(userName, "California");
            System.out.println(userName + " Mudando para nova cidade " + userCityMapping.get(userName) + ", New userCityMapping : " + userCityMapping);
            
            // O método get () retorna `null` se a chave especificada não foi encontrada no HashMap
            System.out.println("Lisa's city : " + userCityMapping.get("Lisa"));
        }

        // Criando LinkedHashMap
        public static void main(String[] args) {
            LinkedHashMap<Integer, String> customerIdNameMapping = new LinkedHashMap<>();
    
            customerIdNameMapping.put(1001, "Jack");
            customerIdNameMapping.put(1002, "David");
            customerIdNameMapping.put(1003, "Steve");
            customerIdNameMapping.put(1004, "Alice");
            customerIdNameMapping.put(1005, "Marie");
    
            System.out.println("customerIdNameMapping : " + customerIdNameMapping);
    
            // Observando se existe LinkedHashMap
            Integer id = 1005;
            if(customerIdNameMapping.containsKey(id)) {
                System.out.println("Procurando com id " + id + " : " + customerIdNameMapping.get(id));
            } else {
                System.out.println("Cliente com id " + id + " não existe");
            }
    
            // Observando se o valor existe no LinkedHashMap
            String name = "David";
            if(customerIdNameMapping.containsValue(name)) {
                System.out.println("Cliente com nome " + name + " existe no map");
            } else {
                System.out.println("Nenhum cliente encontrado com o nome" + name + " in the map");
            }
    
            // Alterando associação com map
            id = 1004;
            customerIdNameMapping.put(id, "Bob");
            System.out.println("Alterar nome do cliente com id " + id + ", Novo map : " + customerIdNameMapping);

             // Removendo chave  LinkedHashMap
            String custon = customerIdNameMapping.remove("Jack");
        }
        // Criando LinkedHashSet
        public static void main(String[] args) {
         
        LinkedHashSet<Num> al = new LinkedHashSet<>();
        dset.add(new Num(2));
        dset.add(new Num(1));
        dset.add(new Num(3));
        dset.add(new Num(5));
        dset.add(new Num(4));
        Iterator<Num> iterator = dset.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}