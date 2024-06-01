"use client";
import { EventSourceMessage, fetchEventSource } from '@microsoft/fetch-event-source';

import { Card } from "@/components/Cards";
import { Car } from "@/interfaces/Car";
import { useEffect, useState } from "react";

export default function Page() {
  const [cards, setCards] = useState<Car[]>([]);
  const [loading, setLoading] = useState<boolean>(true);

  useEffect(() => {
    fetchEventSource('/api/cars/streaming', {
      onmessage(ev: EventSourceMessage) {
        console.log(ev.event)
        if (ev.event === 'car') {
          setCards(c => [...c, JSON.parse(ev.data)])
        } else if (ev.event === 'close') {
          setLoading(false)
        }
      }
    });

  }, []);

  // if (loading) {
  //   return <div className="text-center mt-20">Loading...</div>;
  // }
  return (
    <div className="flex flex-wrap justify-center">
      {cards.map((card) => (
        <Card
          key={card.id}
          imageSrc={"https://via.placeholder.com/400"}
          title={card.model}
          description={card.make}
        />
      ))}
    </div>
  );
}
