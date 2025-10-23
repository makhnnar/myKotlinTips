import { 
  Card, 
  CardContent, 
  CardMedia, 
  Typography, 
  Button, 
  CardActions,
  Box
} from '@mui/material';
import ArrowForwardIcon from '@mui/icons-material/ArrowForward';

import "./postCard.css";

import { Link } from 'react-router-dom'; 

interface PostCardProps {
    title: string;
    description: string;
    imageUrl: string;
    postId: string; // Unique identifier for the post
}

export const PostCard = ({ title, description, imageUrl,postId }:PostCardProps) => {
    const postDetailPath = `/post/${postId}`;
    return (
    <Card className="horizontal-card-root">
      <CardMedia
        component="img"
        className="horizontal-card-media"
        image={imageUrl}
        alt={title}
      />

      <Box className="horizontal-card-content-box">
        <CardContent className="horizontal-card-content">
          <Typography component="div" variant="h5" gutterBottom>
            {title}
          </Typography>
          
          <Typography 
            variant="body2" 
            color="text.secondary"
            className="horizontal-card-description"
          >
            {description}
          </Typography>
        </CardContent>
        
        <CardActions>
          <Button 
            size="small" 
            variant="contained" 
            endIcon={<ArrowForwardIcon />}
            component={Link} 
            to={postDetailPath} 
          >
            Watch More
          </Button>
        </CardActions>
      </Box>
    </Card>
  );
};



