package com.q4k.factories;

import com.q4k.Question;

public class QuestionFactory {

	public static final String ARITHMETIC = "arithmetic";
	public static final String TIME = "time";
	public static final String GEOGRAPHY = "geography";
	public static final String SERIE = "serie";
	public static final String PATTERN = "pattern";
	public static final String QUESTION_LANGUAGE = "question_language";
	
	private ArithmeticQuestionFactory arithmeticQuestionFactory = new ArithmeticQuestionFactory();
	private TimeQuestionFactory timeQuestionFactory = new TimeQuestionFactory();
	private GeographyQuestionFactory geographyQuestionFactory = new GeographyQuestionFactory();
	private SerieQuestionFactory serieQuestionFactory = new SerieQuestionFactory();
	private PatternQuestionFactory patternQuestionFactory = new PatternQuestionFactory();
	private QuestionLanguageQuestionFactory questionLanguageQuestionFactory = new QuestionLanguageQuestionFactory();
	
	public Question generateQuestion(String topic, String levelStr) throws NumberFormatException {
		int level = Integer.parseInt(levelStr);		
		IQuestionFactory responsibleFactory;
		switch (topic) {
        case ARITHMETIC: responsibleFactory = arithmeticQuestionFactory; break;
        case TIME: responsibleFactory = timeQuestionFactory; break;
        case GEOGRAPHY: responsibleFactory = geographyQuestionFactory; break;
        case SERIE: responsibleFactory = serieQuestionFactory; break;
        case PATTERN: responsibleFactory = patternQuestionFactory; break;
        case QUESTION_LANGUAGE: responsibleFactory = questionLanguageQuestionFactory; break;
        default: responsibleFactory = questionLanguageQuestionFactory;
		}
		return responsibleFactory.generateQuestion(level);
	}

}
