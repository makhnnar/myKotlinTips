import ReactMarkdown from "react-markdown";
import { PostReader } from "../posts/repo/postReader";
import AutoNavbar from "../navigation/AutoNavBar";

export const Profile = () => {
    const markdownContent = PostReader("profile"); 
    return <div className="postDetailContainer">
        <div className="postPage">
            <div className="textContent">
                <ReactMarkdown children={markdownContent} />
            </div>
        </div>
        <AutoNavbar markdown={markdownContent}/>
    </div>
}