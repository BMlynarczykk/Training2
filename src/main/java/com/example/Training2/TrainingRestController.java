package com.example.Training2;



import com.example.Training2.Dalszetesty.Tablica;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class TrainingRestController {
    @RequestMapping("/rest")
public String Elon(){
        return "Elon , rest!";
    }

    @RequestMapping("/rest2")
    public List<Tablica> TabliceObiektow(){
        return Arrays.asList(
        new Tablica("1", "Andrzej", "Cuda"),
        new Tablica("2", "ASDASDAsd", "aSDAEF"),
        new Tablica("3", "AAAAAAAAAAA", "AAAAAAAA"),
        new Tablica("4", "YYYYYYYY", "YYYYYYY") // ostatni bez ,
        );
    }

}







