import ReactMarkdown from "react-markdown";
import { PostReader } from "../posts/repo/postReader";
import AutoNavbar from "../navigation/AutoNavBar";

export const Profile = () => {
    const markdownContent = PostReader("profile"); 
    return <div className="postDetailContainer">
        <div className="postPage">
            <ReactMarkdown children={markdownContent} />
        </div>
        <AutoNavbar markdown={markdownContent}/>
    </div>
}