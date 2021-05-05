package Abstract;

import Concrete.Game;

public interface CampaignService {
	
	void Add(Game game);
	void Delete(Game game);
	void Update(Game game);

}
