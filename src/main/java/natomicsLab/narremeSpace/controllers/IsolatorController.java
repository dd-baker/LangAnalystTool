package natomicsLab.narremeSpace.controllers;

import natomicsLab.narremeSpace.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class IsolatorController {
    @GetMapping("/isolator")
    public String narremeIsolator(workspaceSubmission) {
        char[] workspaceSubmission = new char[Submission.split("")];
        List<String> narremeList = new ArrayList<String>();
        for (int i = 0; i < workspaceSubmission.length(); i++) {
            int leftBracketCount;
            int firstLeftBracket;
            int rightBracketCount;
            int lastRightBracket;
            int firstRightBracket;
            int nextRightBracket;
            String primaryMeme;
            String nestedMeme;
            String narreme;

            if (workspaceSubmission[i] = "]") {
                firstRightBracket = workspaceSubmission[i];
                for (int ii = 0; ii < i; ii++) {
                    if (workspaceSubmission[ii] = "[") {
                         leftBracketCount = leftBracketCount + 1;
                        if (firstLeftBracket = null) {
                            firstLeftBracket = workspaceSubmission[ii];
                        }
                    }
                }
                for (int iii = 0; iii < i + 1; iii++) {
                    if (workspaceSubmission[iii] = "]") {
                        rightBracketCount = rightBracketCount + 1;
                        if (rightBracketCount == leftBracketCount) {
                            lastRightBracket = workspaceSubmission[iii]
                        }
                    }
                }
                narreme = workspaceSubmission.substring(firstLeftBracket, lastRightBracket);
                workspaceSubmission = workspaceSubmission.replace(narreme, "");
            }

            for (int iv = 0; iv < narreme.length(); iv--) {
                if (primaryMeme = null) {
                    if (narreme[iv] = "[") {
                        int lastLeftBracket = narreme[iv];
                        String primaryMeme = narreme.substring(lastLeftBracket, firstRightBracket);
                        narreme = narreme.replace(primaryMeme, "*");
                        narremeList.add(primaryMeme);
                    }
                }
                else if(narreme[iv] = "[") {
                    int lastLeftBracket = narreme[iv];
                    for (v = lastLeftBracket - 1; v + 1 > 0; v--) {
                        if (narreme[v] = "]") {
                            nextRightBracket = narreme[v];
                        }
                        nestedMeme = narreme.substring(lastLeftBracket, nextRightBracket);
                        narreme = narreme.replace(nestedMeme[iv], "*");
                        narremeList.add(nestedMeme);
                    }
                }
            }
        }
        return narremeList;
    }
}