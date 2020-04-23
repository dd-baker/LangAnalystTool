package natomicsLab.narremeSpace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WorkspaceController {
    @GetMapping("workspace.html")
    public String workspace() {
        return "workspace";
    }
}

//    @GetMapping("narremeIsolator")
//    @ResponseBody
//    public String narremeIsolator(@RequestParam String workspaceSubmission) {
//        String contentString = workspaceSubmission;
//        int backBracket;
//        int frontBracket;
//        char[] contentArray1 = new char[contentString.length()];
//        char[] narremeArray new char[contentString.length];
//        String[] stringArray;
//        String narremeString;
//
//        static void isolateNarremes (String[] args ){
//            for (int i = 0; i < contentString.length(); i++) {
//                contentArray1[i] = contentString.charAt(i);
//            }
//
//            char[] contentArray2 = contentArray1;
////               System.out.println(contentArray1);
////               System.out.println(contentArray2);
//            for (int i = 0; i < contentArray2.length; i++) {
//                if (contentArray2[i].equals("]")) {
//                    backBracket = i;
//                    contentArray2[i] = "*";
//                    for (int ii = contentArray2[i - 1]; ii > 0; ii--) {
//                        if (contentArray2[ii].equals("[")) {
//                            frontBracket = ii;
//                            contentArray2[ii] = "*";
//                        }
//                        for (int iii = frontBracket; iii < (backBracket - frontBracket); iii++) {
//                            narremeArray = narremeArray.concat(contentArray2[backBracket]);
//                        }
//                    }
//                    narremeString = narremeArray.toString();
//                    // System.out.println(narremeString);
//                    stringArray.push(narremeString);
//                }
//            }
//        }
//
//        @GetMapping("workspaceSubmission")
//        @ResponseBody
//        public String workspaceSubmission () {
//            return "<html>" +
//                    "<body>" +
//                    "<form action='isolator'>" +
//                    "<input type='text' name='workspaceSubmission'>" +
//                    "<input type='submit' value='Submit isolated text for categorization.' >" +
//                    "</form>" +
//                    "</body>" +
//                    "</html>";
//        }
//    }
