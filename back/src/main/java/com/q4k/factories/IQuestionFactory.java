package com.q4k.factories;

import com.q4k.Question;

public interface IQuestionFactory {
	public Question generateQuestion(int level);
}
