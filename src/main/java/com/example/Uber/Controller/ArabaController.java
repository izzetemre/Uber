package com.example.Uber.Controller;

import com.example.Uber.Entity.Araba;
import com.example.Uber.Service.ArabaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/Araba")
public class ArabaController {
    @Autowired
    ArabaService arabaService;

    @RequestMapping(path = "/FindArabaAll",method = RequestMethod.GET)
    public @ResponseBody List<Araba> findArabaAll(){

        return arabaService.findArabaAll();
    }

    @RequestMapping(path = "/SaveAraba", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody HttpStatus saveAraba(@RequestBody Araba araba){

        try {
            arabaService.saveAraba(araba);
            return HttpStatus.OK;
        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }

    @RequestMapping(path = "/FindArabaById/{arabaId}",method = RequestMethod.GET)
    public @ResponseBody Araba findArabaById(@PathVariable Long arabaId){

        return arabaService.findArabaById(arabaId);
    }

    @RequestMapping(path = "/DeleteArabaById", method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteAraba(@RequestBody Araba araba) {

        try{
            arabaService.deleteAraba(araba);
            return HttpStatus.OK;
        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }

    @RequestMapping(path = "/UpdateArabaById/{arabaId}",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus updateArabaById(@PathVariable Long arabaId, @RequestBody Araba newAraba){

        try{

            arabaService.updateArabaById(arabaId, newAraba);
            return HttpStatus.OK;

        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }


}