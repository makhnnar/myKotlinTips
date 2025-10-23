import ReactMarkdown from "react-markdown";
import { PostReader } from "../posts/repo/postReader";

export const Profile = () => {
    const markdownContent = PostReader("profile"); 
    return <div className="postPage">
        <ReactMarkdown children={markdownContent} />
    </div>
}