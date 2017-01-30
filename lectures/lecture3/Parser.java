
Token currentToken = sjavaTokenManager.getNextToken();

		boolean checkToken(int expectedTokenType) {
		if (currentToken.kind == expectedTokenType) {
		currentToken = sjavaTokenManager.getNextToken();
		} else {
		error("Parse error")
		}
		}

		void ParseS() {
		switch(currentToken.kind) {
		case sjavaConstants.PRINT:
		checkToken(sjavaConstants.PRINT);
		checkToken(sjavaConstants.LEFT_PARENTHESIS);
		ParseE();
		checkToken(sjavaConstants.RIGHT_PARENTHESIS);
		break;
		case sjavaConstants.WHILE:
		checkToken(sjavaConstants.WHILE);
		checkToken(sjavaConstants.LEFT_PARENTHESIS);
		ParseE();
		checkToken(sjavaConstants.RIGHT_PARENTHESIS);
		ParseS();
		break;
		case sjavaConstants.LEFT_BRACE:
		checkToken(sjavaConstants.LEFT_BRACE);
		ParseL();
		checkToken(sjavaConstants.RIGHT_BRACE);
		break;
default:
		error("Parse error");
		}
		}

		void ParseE() {
		switch(currentToken.kind) {
		case sjavaConstants.IDENTIFIER:
		checkToken(sjavaConstants.IDENTIFIER);
		break;
		case sjavaConstants.INTEGER_LITERAL
		checkToken(sjavaConstants.INTEGER_LITERAL)
		break;
default:
		error("Parse Error");
		}
		}

		void ParseL() {
		switch(currentToken.kind) {
		case RIGHT_BRACE:
        /* Do nothing --
           this is the epsilon case */
		break;
default:
		ParseS();
		ParseL();
		}
		}


