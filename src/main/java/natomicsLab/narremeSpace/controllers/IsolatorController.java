package natomicsLab.narremeSpace.controllers;

import natomicsLab.narremeSpace.
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IsolatorController {
    public String narremeIsolator(workspaceSubmission) {
        List<String> narremeList = new ArrayList<String>();
        for (i = 0; i < workspaceSubmission.length(); i++) {
            String narreme = "";
            if (workspaceSubmission[i] = "]") {
                String firstRightBracket = workspaceSubmission[i];
                for (ii = 0; ii < i; ii++) {
                    if (workspaceSubmission[ii] = "[") {
                        int leftBracketCount = leftBracketCount + 1;
                        if (firstLeftBracket = null) {
                            String firstLeftBracket = workspaceSubmission[ii];
                        }
                    }
                }
                for (iii = 0; iii < i + 1; iii++) {
                    if (workspaceSubmission[iii] = "]" {
                        int rightBracketCount = rightBracketCount + 1;
                        if (rightBracketCount = leftBracketCount) {
                            lastRightBracket = workspaceSubmission[iii]
                        }
                    }
                }
                narreme = workspaceSubmission.substring(firstLeftBracket, lastRightBracket);
                workspaceSubmission = workspaceSubmission.replace(narreme, "");
            }

            for (iv = 0; iv < narreme.length; iv--) {
                if (primaryMeme = null) {
                    if (narreme[iv] = "[") {
                        int lastLeftBracket = narreme[iv];
                        String primaryMeme = narreme.substring(lastLeftBracket, firstRightBracket);
                        narreme = narreme.replace(primaryMeme, "*");
                        narremeList.add(primaryMeme);
                    }
                }
                elseif(narreme[iv] = "[") {
                    int lastLeftBracket = narreme[iv];
                    for (v = lastLeftBracket - 1; v + 1 > 0; v--) {
                        if (narreme[v] = "]") {
                            String nextRightBracket = narreme[v];
                        }
                        String nestedMeme = narreme.substring(lastLeftBracket, nextRightBracket);
                        narreme = narreme.replace(nestedMeme[iv], "*");
                        narremeList.add(nestedMeme);
                    }
                }
            }
        }
        return narremeList;
    }
}