package pl.javastart.currenttimeanddate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class ShowingTime {

    @RequestMapping("/")
    @ResponseBody
    public String CurrentLocalTime (){
      return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Calendar.getInstance().getTime());
    }
}
