package com.example.Uber.Controller;

import com.example.Uber.Entity.Kart;
import com.example.Uber.Service.KartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/Kart")
public class KartController {
    @Autowired
    KartService kartService;

    @RequestMapping(path = "/FindKartAll",method = RequestMethod.GET)
    public @ResponseBody List<Kart> findKartAll(){

        return kartService.findKartAll();
    }

    @RequestMapping(path = "/SaveKart", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody HttpStatus saveKart(@RequestBody Kart kart){

        try {
            kartService.saveKart(kart);
            return HttpStatus.OK;
        }
        catch (Exception e){
            return HttpStatus.BAD_REQUEST;   }

    }

    @RequestMapping(path = "/FindKartById/{kartId}",method = RequestMethod.GET)
    public @ResponseBody Kart findKartById(@PathVariable Long kartId){

        return kartService.findKartById(kartId);
    }

    @RequestMapping(path = "/DeleteKartById/{kartId}", method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteKart(@PathVariable Long kartId) {

        try{
            kartService.deleteKartById(kartId);
            return HttpStatus.OK;
        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }

    @RequestMapping(path = "/UpdateKartById/{kartId}",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus updateKartById(@PathVariable Long kartId, @RequestBody Kart newKart){

        try{

                kartService.updateKartById(kartId, newKart);
                return HttpStatus.OK;

        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }


}
