package org.launchcode.SkillsTrackerStudio.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class skillsController {

    @GetMapping("/")
    public String skills(){
        return "<h1>Skills Tracker<h1>" +

                "<h2>Languages<h2>" +

                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>HTML</li>" +
                "<ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String form(){
        return "<body>" +
                "<form action = 'form' method = 'post'>" +
                "<label>Enter Your Name:<label>" +
                "<input type = \"text\" id = \"wname\" name = \"wname\" ><br/>" +
                "<label>Favorite Programming language</label><br/>" +
                "<select name=\"language1\" id=\"language1\">" +
                "  <option value=\"Java\">Java</option>" +
                "  <option value=\"JS\">JavaScript</option>" +
                "  <option value=\"HTML\">HTML</option>" +
                "</select><br/>" +
                "<label>Second Favorite Programming language</label><br/>" +
                "<select name=\"language2\" id=\"language2\">" +
                "  <option value=\"Java\">Java</option>" +
                "  <option value=\"JS\">JavaScript</option>" +
                "  <option value=\"HTML\">HTML</option>" +
                "</select><br/>" +
                "<label>Third Favorite Programming language</label><br/>" +
                "<select name=\"language3\" id=\"language3\">" +
                "  <option value=\"Java\">Java</option>" +
                "  <option value=\"JS\">JavaScript</option>" +
                "  <option value=\"HTML\">HTML</option>" +
                "</select><br/>" +
                "<input type=\"submit\" value=\"Submit\"/>" +
                "</form>" +
                "</body>";
    }
    @PostMapping("/form")
    @ResponseBody
    public String answers(@RequestParam(name = "wname") String Wname,
                          @RequestParam(name = "language1") String l1,
                          @RequestParam(name = "language2") String l2,
                          @RequestParam(name = "language3") String l3
                          ){
        return "<h1>" +
                Wname +
                "</h1><br/>" +
                "<ol>" +
                "<li>" +
                l1 +
                "</li>" +
                "<li>" +
                l2 +
                "</li>" +
                "<li>" +
                l3 +
                "</li>" +
                "<ol>";



    }
}
