import { PostCard } from "../posts/PostCard";
import { posts } from "../posts/repo/postRepo";

export const Home = () => {
    return (
        <div>
            {posts.map( postData => <PostCard {...postData} />)}
        </div>
    );
}