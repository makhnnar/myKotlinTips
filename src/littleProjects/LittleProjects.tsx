import { examples } from "../posts/repo/postRepo";
import { CardItem } from "../views/CardItem";
import { RedirectionButton } from "../views/RedirectionButton";

export const LittleProjects = () => {
    return <div className="homePostContainer">
            {examples.map(
                postData => <CardItem {...postData} >
                    <RedirectionButton route={postData.route} />
                </CardItem>
            )}
    </div>;
}