package com.example.marriageux.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Wedding {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private  String name;
    private LocalDateTime weddingDate;

    //mappedBy eksik olduğu için JPA, Wedding ile weddingGuests arasında bağlantı kurmak için ekstra bir ara tablo (join table) oluşturur.
    //wedding_wedding_guest diye bir ara tablo oluşturuyor bağlantı kurabilmek için
    // örneğin şimdi 5 model var 6 tane tablo oluşturuyor
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<WeddingGuest>  weddingGuests;

    // burada ise user sınıfında mappedby kullanarak ilişkinin naısl yönetileceğini belirttik
    @ManyToOne
    private User user;


}
