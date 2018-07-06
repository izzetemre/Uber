package com.example.Uber.Controller;

import com.example.Uber.Entity.Islem;
import com.example.Uber.Service.IslemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/Islem")
public class IslemController {
    @Autowired
    IslemService islemService;

    @RequestMapping(path = "/FindIslemAll",method = RequestMethod.GET)
    public @ResponseBody List<Islem> findIslemAll(){

        return islemService.findIslemAll();
    }

    @RequestMapping(path = "/SaveIslem", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody HttpStatus saveIslem(@RequestBody Islem islem){

        try {
            islemService.saveIslem(islem);
            return HttpStatus.OK;
        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }

    @RequestMapping(path = "/FindIslemById/{islemId}",method = RequestMethod.GET)
    public @ResponseBody Islem findIslemById(@PathVariable Long islemId){

        return islemService.findIslemById(islemId);
    }

    @RequestMapping(path = "/DeleteIslemById/{islemId}", method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteIslem(@PathVariable Long islemId) {

        try{
            islemService.deleteIslemById(islemId);
            return HttpStatus.OK;
        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }

    @RequestMapping(path = "/UpdateIslemById/{islemId}",method = RequestMethod.PUT)
    public @ResponseBody HttpStatus updateIslemById(@PathVariable Long islemId, @RequestBody Islem newIslem){

        try{

                islemService.updateIslemById(islemId, newIslem);
                return HttpStatus.OK;

        }
        catch (Exception e){    return HttpStatus.BAD_REQUEST;   }

    }


}
