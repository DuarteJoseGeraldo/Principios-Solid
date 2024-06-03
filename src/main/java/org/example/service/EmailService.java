package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailService {
    private String from = "contato@site.com.br";
    private String to;
    private String title;
    private String body;

    public static String sendEmail(){
        return "Email enviado com sucesso!";
    }
}