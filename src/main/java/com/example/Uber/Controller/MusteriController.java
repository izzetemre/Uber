package com.example.Uber.Controller;

import com.example.Uber.Entity.Musteri;
import com.example.Uber.Service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/Musteri")
public class MusteriController {
    @Autowired
    MusteriService musteriService;

    @RequestMapping(path = "/FindMusteriAll",method = RequestMethod.GET)
    public @ResponseBody List<Musteri> findMusteriAll(){

        return musteriService.findMusteriAll();
    }

    @RequestMapping(path = "/SaveMusteri", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody HttpStatus saveMusteri(@RequestBody Musteri musteri){

        try {
            musteriService.saveMusteri(musteri);
        }
        catch (Exception e){}

        return HttpStatus.OK;
    }

    @RequestMapping(path = "/FindMusteriById/{musteriId}",method = RequestMethod.GET)
    public @ResponseBody Musteri findMusteriById(@PathVariable Long musteriId){

        return musteriService.findMusteriById(musteriId);
    }

    @RequestMapping(path = "/DeleteMusteriById/{musteriId}", method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteMusteri(@PathVariable Long musteriId) {

        try{
            musteriService.deleteMusteriById(musteriId);
        }
        catch (Exception e){}

        return HttpStatus.OK;
    }

    @RequestMapping(path = "/UpdateMusteriById/{musteriId}",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus findMusteriById(@PathVariable Long musteriId, @RequestBody Musteri newMusteri){

        try{

                musteriService.updateMusteriById(musteriId, newMusteri);
                return HttpStatus.OK;

        }
        catch (Exception e){}

        return null;
    }


}
