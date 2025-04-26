package com.example.marriageux.dto;


import com.example.marriageux.model.User;

public record UserDto(
        String name,
        String surname
) {

        public User toUser() {

          return User.builder()
                  .name(name)
                  .surname(surname)
                  .build();
        }
}


//Java'da record, Java 14 ile tanıtılan ve Java 16 itibarıyla stabil hâle gelen özel bir sınıf türüdür.
// Kısaca, veri taşıma amaçlı sınıfları (DTO – Data Transfer Object gibi) çok daha kısa ve okunabilir
// şekilde tanımlamamıza olanak tanır.