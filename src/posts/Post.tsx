import { useParams } from "react-router-dom";
import ReactMarkdown from "react-markdown";
import './postPage.css';
import { PostReader } from "./repo/postReader";
import AutoNavbar from "../navigation/AutoNavBar";

export const PostDetail = () => {
  const { id } = useParams(); // Get the 'id' parameter from the URL
  const markdownContent = PostReader(id || ""); 
  return <div className="postDetailContainer">
    <div className="postPage">
      <div className="textContent">
        <ReactMarkdown children={markdownContent} />
      </div>
    </div>
    <AutoNavbar markdown={markdownContent}/>
  </div>
};