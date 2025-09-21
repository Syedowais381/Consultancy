import React from "react";
import Card from "../components/Card";

const news = [
  { id:1, title:"New Consultancy Arm", content:"Launch of specialist consultancy for onshore pipelines.", date:"2025-09-20", image:"/images/news1.jpg" },
  { id:2, title:"3D Visualisation Innovation", content:"Immersive 3D visualisation to improve stakeholder engagement.", date:"2025-08-11", image:"/images/news2.jpg" }
];

export default function News() {
  return (
    <div>
      <section className="page-hero">
        <div className="container">
          <div className="page-hero-content">
            <span className="page-badge">Latest Updates</span>
            <h1 className="page-title">News & Insights</h1>
            <p className="page-description">
              Stay informed with our latest company news, industry insights, and project updates
            </p>
          </div>
        </div>
      </section>
      
      <section className="container page-content">
        <div className="cards-grid">
          {news.map(n => (
            <Card key={n.id} title={n.title} subtitle={n.date} image={n.image}>
              {n.content}
            </Card>
          ))}
        </div>
      </section>
    </div>
  );
}
