package com.example.Uber.Controller;

import com.example.Uber.Entity.Sofor;
import com.example.Uber.Service.SoforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/Sofor")
public class SoforController {
    @Autowired
    SoforService soforService;

    @RequestMapping(path = "/FindSoforAll",method = RequestMethod.GET)
    public @ResponseBody List<Sofor> findSoforAll(){

        return soforService.findSoforAll();
    }

    @RequestMapping(path = "/SaveSofor", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody HttpStatus saveSofor(@RequestBody Sofor sofor){

        try {
            soforService.saveSofor(sofor);
            return HttpStatus.OK;
        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }


    }

    @RequestMapping(path = "/FindSoforById/{soforId}",method = RequestMethod.GET)
    public @ResponseBody Sofor findSoforById(@PathVariable Long soforId){

        return soforService.findSoforById(soforId);
    }

    @RequestMapping(path = "/DeleteSofor", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody HttpStatus deleteSofor(@RequestBody Sofor sofor) {

        try{
            soforService.deleteSofor(sofor);
            return HttpStatus.OK;
        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }


    }

    @RequestMapping(path = "/UpdateSoforById/{soforId}",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus updateSoforById(@PathVariable Long soforId, @RequestBody Sofor newSofor){

        try{

            soforService.updateSoforById(soforId, newSofor);
            return HttpStatus.OK;
        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }


}