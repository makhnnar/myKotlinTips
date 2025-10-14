import { data, PostCard } from "../posts/PostCard";

export const Home = () => {
    return (
        <div>
            <h2>Home Page</h2>
            <PostCard {...data} />
        </div>
    );
}