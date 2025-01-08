package com.beta.version.xlang_serde.serde_util;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a sample object
            Person person = new Person("John", "Doe", 30, "johndoe@example.com");

            // Serialize to JSON
            String json = CrossLanguageSerializer.toJson(person);
            System.out.println("Serialized JSON:");
            System.out.println(json);
            
            // Deserialize from JSON
            Person personFromJson = CrossLanguageSerializer.fromJson(json, Person.class);
            System.out.println("\nDeserialized from JSON:");
            System.out.println(personFromJson);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


