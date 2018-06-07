package de.upb.ds.surnia.preprocessing.tasks;

import de.upb.ds.surnia.preprocessing.Token;
import java.util.List;

public interface TaskInterface {

  List<Token> processTokens(String question, List<Token> tokens);

}
