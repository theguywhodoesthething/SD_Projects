package web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import lotto.Hopper;

@Controller
@SessionAttributes("lottoHistory")
public class LottoController2 {
	@Autowired
	private Hopper hopper;
	
	@ModelAttribute("lottoHistory")
	public List<Integer[]> initSessionObject() {
		List<Integer[]> list = new ArrayList<>();
		return list;
	}

	@RequestMapping("GetNumbers2.do")
	public String lotto(@RequestParam("howmany") int count,
			@ModelAttribute("lottoHistory") List<Integer[]> list) {

		list.add(getLottoNumbers(count));
		return "form2.jsp";
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
