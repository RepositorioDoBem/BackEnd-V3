package com.fatec.sp.gov.br.RepositorioDoBem.Configuration;

import com.fatec.sp.gov.br.RepositorioDoBem.Builder.Alimento;
import com.fatec.sp.gov.br.RepositorioDoBem.Builder.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    Usuario.UsuarioBuilder builder_02 = new Usuario.UsuarioBuilder();

    Usuario usuario = builder_02
            .cnpj("0000000111110001-11")
            .nomeEmpresa("Renner")
            .cep("00000-000")
            .email("renner@hotmail.com")
            .senha("renner102030")
            .criarUsuario();

    @Bean (name = "numeroCnpj")
    public String numeroCnpj(){
        return usuario.getCnpj();
    }

    @Bean(name = "nomeDaEmpresa")
    public String nomeDaEmpresa(){
        return usuario.getNomeEmpresa();
    }

    @Bean (name = "numeroCep")
    public String numeroCep(){
        return usuario.getCep();
    }

    @Bean( name = "enderecoEmail")
    public String enderecoEmail(){
        return usuario.getEmail();
    }

    @Bean(name = "caracteresSenha")
    public String caracteresSenha() {
        return usuario.getSenha();
    }

    @Bean(name= "verificarLogin")
    public boolean verificarLogin(){
        return usuario.verificarLogin("renner@hotmail.com", "renner125"); //Vai retornar false
    }

    Alimento.Builder builder = new Alimento.Builder();

    Alimento alimento = builder
            .nome("Arroz")
            .peso(5.0)
            .quantidade(1)
            .validade("01/09/2027")
            .build();


    @Bean(name = "nomeAlimento")
    public String nomeAlimento(){
        return alimento.getNome();
    }

    @Bean(name = "pesoAlimento")
    public double pesoAlimento(){
        return alimento.getPeso();
    }

    @Bean(name = "quantidadeAlimento")
    public int quantidadeAlimento(){
        return alimento.getQuantidade();
    }

    @Bean(name = "validadeAlimento")
    public String validadeAlimento(){
        return alimento.getValidade();
    }

}
