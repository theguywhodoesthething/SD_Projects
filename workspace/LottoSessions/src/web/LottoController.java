package web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lotto.Hopper;

@Controller
public class LottoController {
	@Autowired
	private Hopper hopper;

	@RequestMapping("GetNumbers.do")
	public String lotto(@RequestParam("howmany") int count, 
			HttpSession session) {

		List<Integer[]> lottoHistory = 
				(List<Integer[]>) session.getAttribute("lottoHistory");
		if (lottoHistory == null) {
			// first time
			lottoHistory = new ArrayList<>();
			session.setAttribute("lottoHistory", lottoHistory);
		}
		
		lottoHistory.add(getLottoNumbers(count));
		return "form.jsp";
	}
	
	private Integer[] getLottoNumbers(int howMany) {
		Integer[] drawing = new Integer[howMany];
		hopper.reset();
		for (int i = 0; i < howMany; i++) {
			drawing[i] = Integer.parseInt(hopper.drawBall().getValue());
		}
		Arrays.sort(drawing);
		return drawing;
	}
}
