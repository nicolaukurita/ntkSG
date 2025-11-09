package br.com.etematica.ntksg;

import br.com.etematica.ntksg.service.Gerar;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
//@EnableScheduling
@NoArgsConstructor
@AllArgsConstructor
public class NtkSgConfigurator {
    @Autowired
    Gerar gerar;

    @Scheduled(fixedDelay = 10000)
    public void gerar(){
        System.out.println("Fixed delay " + System.currentTimeMillis() / 1000);
        gerar.GerarProjetos();
    }
}
